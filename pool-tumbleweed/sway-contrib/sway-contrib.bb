SUMMARY = "Contributed scripts for sway"
DESCRIPTION = "Contributed scripts from sway package."
LICENSE = "MIT"

PV = "1.8.1"

RPM_NAME = "sway-contrib-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "9e3b472563e5baeb047cea6c352b36659f899895c43e68e0e9720c3958989dff7fc1f23c7fd2ca6086b06015c2a374193196a0cc02e453cf356a9731addba31b"

RPROVIDES:${PN} += "sway-contrib"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
grim \
jq \
python3-i3ipc \
slurp \
sway \
wl-clipboard"

inherit rpm
