SUMMARY = "Salt plugin for Vim"
DESCRIPTION = "This Vim plugin provides support for editing Saltstack .sls files."
LICENSE = "Apache-2.0"

PV = "20170630"

RPM_NAME = "vim-plugin-salt-20170630-56.1.noarch.rpm"
RPM_HASH = "5c473d5942740c776518325cb85ed04292153174853a16d98c61d00558147cf0f65af130068f23476081e97e69e666cdcc40bbb87c4303fd8012c59a9fd3ead0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-salt"

RDEPENDS:${PN} += ""

inherit rpm
