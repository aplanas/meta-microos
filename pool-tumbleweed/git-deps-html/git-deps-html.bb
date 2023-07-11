SUMMARY = "Tool to analyze git deps - HTML parts"
DESCRIPTION = "Documentation for git-deps."
LICENSE = "GPL-2.0-only"

PV = "1.0.2+git.1559732444.7c75531"

RPM_NAME = "git-deps-html-1.0.2+git.1559732444.7c75531-4.5.noarch.rpm"
RPM_HASH = "e1fd21d14cd6f5e98cc1480941348a839057689f118fb697cb912d2929a6c831253e7c24a8e87b1c52ca096020c11af972ac352b0f1ebc940c2dc9f602a59186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "git-deps-html"

RDEPENDS:${PN} += ""

inherit rpm
