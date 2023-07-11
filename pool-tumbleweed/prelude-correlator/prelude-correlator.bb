SUMMARY = "Real time correlator of events received by Prelude Manager"
DESCRIPTION = "Prelude-Correlator allows conducting multi-stream correlations \
thanks to a powerful programming language for writing correlation \
rules. With any type of alert able to be correlated, event \
analysis becomes simpler, quicker and more incisive. This \
correlation alert then appears within the Prewikka interface \
and indicates the potential target information via the set of \
correlation rules."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-correlator-5.2.0-2.6.noarch.rpm"
RPM_HASH = "a13c106015965d66c5777f76b8fc91b3bd94165aa730d49c0570067598dc0bbe472814f5170f44704f3004e3dd3a87913902ac2b2bddb15d37a2393f60581457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-prelude-correlator \
prelude-correlator \
prelude-correlator-core"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-prelude-correlator \
systemd"

inherit rpm
