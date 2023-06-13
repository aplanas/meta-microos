SUMMARY = "Config manager for $HOME based on git"
DESCRIPTION = "vcsh allows you to have several git repositories, all maintaining \
their working trees in $HOME without clobbering each other. That, in \
turn, means you can have one repository per config set (zsh, vim, \
ssh, etc), picking and choosing which configs you want to use on \
which machine."
LICENSE = "GPL-2.0-only"

PV = "1.20151229"

RPM_NAME = "vcsh-1.20151229-3.11.noarch.rpm"
RPM_HASH = "5da16a2c155889dc0b350bc49220d7c85b7dfd300ea1364323005295bfb812c5e72509c3eb43429df05f5e3e71488dac481a103d6c1eea84ab00c0fdeeaedea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vcsh"

RDEPENDS:${PN} += "/bin/sh \
bash \
git-core"

inherit rpm
