SUMMARY = "Controller for Yeelight smart devices"
DESCRIPTION = "Controller for Yeelight smart devices"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.13"

RPM_NAME = "perl-Device-Yeelight-0.13-1.11.noarch.rpm"
RPM_HASH = "7f2fc8d52c20e8cc75ed62894ebc4180e02751d989b074827d7f6df38ffe8faa884a517b6fda69f44ce81da88d13c1e93b526a68c7cab755019a59621ed84b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Device--Yeelight \
perl-Device--Yeelight--Light \
perl-Device-Yeelight"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO \
perl-IO--Socket--Multicast \
perl-JSON"

inherit rpm
