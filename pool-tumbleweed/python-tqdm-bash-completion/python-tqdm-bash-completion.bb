SUMMARY = "Bash completion for python-tqdm"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses. \
 \
This package provides the completion file for bash"
LICENSE = "MIT & MPL-2.0"

PV = "4.65.0"

RPM_NAME = "python-tqdm-bash-completion-4.65.0-1.3.noarch.rpm"
RPM_HASH = "cda43073383bde5b55d8529063d043edc152b3ec395da21fb77eb0f64f7111fea56b052a769653ededded0d7a946ee32fd5c72d846b9ffd26e1e21cb0359696f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tqdm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
