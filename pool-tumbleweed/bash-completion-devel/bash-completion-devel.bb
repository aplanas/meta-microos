SUMMARY = "The Configuration of Programmable Completion for Bash"
DESCRIPTION = "This package contains the package configuration file of the \
package bash-completion."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "bash-completion-devel-2.11-7.1.noarch.rpm"
RPM_HASH = "f40bf2e796eedb1dfd81924a8ea66f1e2904ef36ef53e535f45453b6a1333bd79b1d12e09dbf709cf538a506d66fe894b7fb097cbbfa6a3dfb54d75fd0d92e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion-/usr/share/pkgconfig/bash-completion.pc \
bash-completion-devel \
pkgconfig-bash-completion"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
