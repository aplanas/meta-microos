SUMMARY = "Bash completion for python-tqdm"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses. \
 \
This package provides the completion file for bash"
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python-tqdm-bash-completion-4.66.1-2.1.noarch.rpm"
RPM_HASH = "38428212c052c13f3ef31b436357949f2d9646b36d3668cce87a6b2a423fdce24a0b1163b8b96557b677d55955bb75d71f925a61d92b19933635dad463d00c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tqdm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
