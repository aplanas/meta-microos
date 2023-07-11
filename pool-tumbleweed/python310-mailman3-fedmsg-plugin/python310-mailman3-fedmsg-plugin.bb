SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python310-mailman3-fedmsg-plugin-0.5-1.15.noarch.rpm"
RPM_HASH = "2dbb3b0697af694d37026e0c3023b2121260034bf99edd4bba595e4664dc11aba2cb0c34e36de65622b4821ffb1c0ba4c9cd447c5d516ad224e432d452ef6aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mailman3-fedmsg-plugin \
python310-mailman3-fedmsg-plugin \
python3dist-mailman3-fedmsg-plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
