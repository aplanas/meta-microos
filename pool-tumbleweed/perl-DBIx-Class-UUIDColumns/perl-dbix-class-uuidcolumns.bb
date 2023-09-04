SUMMARY = "Implicit uuid columns"
DESCRIPTION = "This the DBIx::Class manpage component resembles the behaviour of the \
Class::DBI::UUID manpage, to make some columns implicitly created as uuid. \
 \
When loaded, 'UUIDColumns' will search for a suitable uuid generation \
module from the following list of supported modules: \
 \
  Data::UUID \
  APR::UUID* \
  UUID \
  Win32::Guidgen \
  Win32API::GUID \
 \
If no supporting module can be found, an exception will be thrown. \
 \
*APR::UUID will not be loaded under OpenBSD due to an as yet unidentified \
XS issue. \
 \
If you would like to use a specific module, you can set the /uuid_class \
manpage: \
 \
  __PACKAGE__->uuid_class('::Data::UUID'); \
  __PACKAGE__->uuid_class('MyUUIDGenerator');"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02006"

RPM_NAME = "perl-DBIx-Class-UUIDColumns-0.02006-2.19.noarch.rpm"
RPM_HASH = "922d0c7b21c9af9bbdcc163e3000c7f5f210f90019b52ac3cd273b004973bab9e8f59aea9c572de6478edca25faa89add09352b7ee948c33bbe7f7d75f03c5b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--UUIDColumns \
perl-DBIx--Class--UUIDColumns--UUIDMaker \
perl-DBIx--Class--UUIDColumns--UUIDMaker--APR--UUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Data--GUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Data--UUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Data--Uniqid \
perl-DBIx--Class--UUIDColumns--UUIDMaker--UUID \
perl-DBIx--Class--UUIDColumns--UUIDMaker--UUID--Random \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Win32--Guidgen \
perl-DBIx--Class--UUIDColumns--UUIDMaker--Win32API--GUID \
perl-DBIx-Class-UUIDColumns"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Grouped \
perl-DBIx--Class \
perl-Data--UUID"

inherit rpm
