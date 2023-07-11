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

RPM_NAME = "perl-DBIx-Class-UUIDColumns-0.02006-2.18.noarch.rpm"
RPM_HASH = "9d071b382f4c720102b3cfba1a03f5655ce3427a9d4e7de98d9c62d5b7c4bd40ad5498e97bacbc052fd4669cd0ec5ced56b51261abc6e2170e12e9ca9c8d5347"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Grouped \
perl-DBIx--Class \
perl-Data--UUID"

inherit rpm
