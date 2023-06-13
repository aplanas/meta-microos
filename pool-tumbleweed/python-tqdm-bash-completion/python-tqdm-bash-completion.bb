SUMMARY = "Bash completion for python-tqdm"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses. \
 \
This package provides the completion file for bash"
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python-tqdm-bash-completion-4.65.0-1.1.noarch.rpm"
RPM_HASH = "c30284edc13053b35fd51cbe1b06f0e9b7af11b815ad833a690e480de5cd7ed80860e8c9a3e7f5b666d853210ee2d2f5a1cb3b70bd3b29d2b8f956cd1f8b2a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tqdm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
