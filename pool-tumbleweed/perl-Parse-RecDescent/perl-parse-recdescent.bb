SUMMARY = "Generate Recursive-Descent Parsers"
DESCRIPTION = "Generate Recursive-Descent Parsers"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.967015"

RPM_NAME = "perl-Parse-RecDescent-1.967015-1.24.aarch64.rpm"
RPM_HASH = "688fdcb908f5e2cedfe865c08b89fcb26d3c333c5e04f7825fc9b00c844ddb9706da2b7746fea7463a746f555e66477bffa7cedc9e96a672ba49f2413f0a269b"

RPROVIDES:${PN} += "perl-Parse--RecDescent \
perl-Parse--RecDescent--Action \
perl-Parse--RecDescent--ColCounter \
perl-Parse--RecDescent--Directive \
perl-Parse--RecDescent--Error \
perl-Parse--RecDescent--Expectation \
perl-Parse--RecDescent--InterpLit \
perl-Parse--RecDescent--LineCounter \
perl-Parse--RecDescent--Literal \
perl-Parse--RecDescent--OffsetCounter \
perl-Parse--RecDescent--Operator \
perl-Parse--RecDescent--Production \
perl-Parse--RecDescent--Repetition \
perl-Parse--RecDescent--Result \
perl-Parse--RecDescent--Rule \
perl-Parse--RecDescent--Subrule \
perl-Parse--RecDescent--Token \
perl-Parse--RecDescent--UncondReject \
perl-Parse-RecDescent"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
