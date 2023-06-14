SUMMARY = "Parse and format strp and strf time patterns"
DESCRIPTION = "This module implements most of 'strptime(3)', the POSIX function that is \
the reverse of 'strftime(3)', for 'DateTime'. While 'strftime' takes a \
'DateTime' and a pattern and returns a string, 'strptime' takes a string \
and a pattern and returns the 'DateTime' object associated."
LICENSE = "Artistic-2.0"

PV = "1.79"

RPM_NAME = "perl-DateTime-Format-Strptime-1.79-1.9.noarch.rpm"
RPM_HASH = "2684d9755bebe980cbc08e0c8038689a9da22494c188b945cbe66cf004b9c72f5413ee389cfcf77be3038843338ad6f200e1537bfb3c83dc8fd2f37c6d8ba9b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Strptime \
perl-DateTime--Format--Strptime--Types \
perl-DateTime-Format-Strptime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
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
