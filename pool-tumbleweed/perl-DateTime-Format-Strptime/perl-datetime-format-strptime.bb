SUMMARY = "Parse and format strp and strf time patterns"
DESCRIPTION = "This module implements most of 'strptime(3)', the POSIX function that is \
the reverse of 'strftime(3)', for 'DateTime'. While 'strftime' takes a \
'DateTime' and a pattern and returns a string, 'strptime' takes a string \
and a pattern and returns the 'DateTime' object associated."
LICENSE = "Artistic-2.0"

PV = "1.79"

RPM_NAME = "perl-DateTime-Format-Strptime-1.79-1.11.noarch.rpm"
RPM_HASH = "35ca681a457fc3d0fd57b558fe712674b805cacef24cc17d30880de7ab6acacec3e8e5ef45c5aa4e1b191bb69dba3d8317f0b74f8f25110009523388f5b69782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Strptime \
perl-DateTime--Format--Strptime--Types \
perl-DateTime-Format-Strptime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Locale \
perl-DateTime--Locale--Base \
perl-DateTime--Locale--FromData \
perl-DateTime--TimeZone \
perl-Params--ValidationCompiler \
perl-Specio \
perl-Specio--Declare \
perl-Specio--Exporter \
perl-Specio--Library--Builtins \
perl-Specio--Library--String \
perl-Try--Tiny \
perl-parent"

inherit rpm
