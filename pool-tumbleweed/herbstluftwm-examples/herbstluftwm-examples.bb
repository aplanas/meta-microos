SUMMARY = "Example scripts for herbstluftwm"
DESCRIPTION = "Sample bash scripts for herbstluftwm and herbstclient, which give the user \
an idea of what is possible."
LICENSE = "BSD-2-Clause"

PV = "0.9.5"

RPM_NAME = "herbstluftwm-examples-0.9.5-1.4.noarch.rpm"
RPM_HASH = "8778348917baa3027a3035e0ca901d0c847a36b8f718673d6bbff92d9549d019fba080b2cb6c5516b15cbc9de535bfdeea35572bdbc98678eb11caa0ebf603a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "herbstluftwm-examples"
RDEPENDS:${PN} += "/usr/bin/bash \
bash \
herbstluftwm"

inherit rpm
