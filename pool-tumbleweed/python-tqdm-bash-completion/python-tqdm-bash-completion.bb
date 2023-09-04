SUMMARY = "Bash completion for python-tqdm"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses. \
 \
This package provides the completion file for bash"
LICENSE = "MIT & MPL-2.0"

PV = "4.66.1"

RPM_NAME = "python-tqdm-bash-completion-4.66.1-1.1.noarch.rpm"
RPM_HASH = "b70817c3311502ea052f32af83d75e326a268311d3c21acb6a3d604b80185120fb34da75794c60c10f6be2af2b489c01ccfcbd9de5e3b65e84dd0fedf82e9aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tqdm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
