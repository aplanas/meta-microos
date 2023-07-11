SUMMARY = "Generate Recursive-Descent Parsers"
DESCRIPTION = "Generate Recursive-Descent Parsers"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.967015"

RPM_NAME = "perl-Parse-RecDescent-1.967015-1.23.aarch64.rpm"
RPM_HASH = "78d3b6513db09a9775371af3758e920011e2da87e52ed45c0386725cffc2da6a7500108c38c657f44e57e29a857a21b670fcaca8520d9d0668fc4bde5583f55d"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
