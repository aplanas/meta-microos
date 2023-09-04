SUMMARY = "String munging for loggers"
DESCRIPTION = "string munging for loggers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.101246"

RPM_NAME = "perl-String-Flogger-1.101246-1.4.noarch.rpm"
RPM_HASH = "be273802beb36477a5b01f6ffcbb70a3995a1f2a587f5a18376a26526a9115d5ab92cbe9bd735636b77ca4069b380c06b700c16084e780012b18570f2b2ef56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Flogger \
perl-String-Flogger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-JSON--MaybeXS \
perl-Params--Util \
perl-Sub--Exporter \
perl-Sub--Exporter--Util"

inherit rpm
