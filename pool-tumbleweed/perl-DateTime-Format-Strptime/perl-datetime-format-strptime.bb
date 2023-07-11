SUMMARY = "Parse and format strp and strf time patterns"
DESCRIPTION = "This module implements most of 'strptime(3)', the POSIX function that is \
the reverse of 'strftime(3)', for 'DateTime'. While 'strftime' takes a \
'DateTime' and a pattern and returns a string, 'strptime' takes a string \
and a pattern and returns the 'DateTime' object associated."
LICENSE = "Artistic-2.0"

PV = "1.79"

RPM_NAME = "perl-DateTime-Format-Strptime-1.79-1.10.noarch.rpm"
RPM_HASH = "42d211cf88059b2277cb9b825477c90a3f081cba03068923e03941472fee86a62b505cc40854dd9bfbb5afc51d5abbf0cb4ee58e5ca825b5211509f5a644d1e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Strptime \
perl-DateTime--Format--Strptime--Types \
perl-DateTime-Format-Strptime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
