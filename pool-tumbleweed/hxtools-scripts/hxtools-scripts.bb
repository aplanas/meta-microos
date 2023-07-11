SUMMARY = "Collection of day-to-day tools (scripts)"
DESCRIPTION = "Architecture-independent programs from hxtools. \
 \
* cwdiff(1) — run wdiff with color \
* diff2php(1) — transform patch to self-serving PHP file \
* doxygen-kerneldoc-filter(1) — filter for Doxygen to support kerneldoc \
* filenameconv(1) — convert file name encoding \
* git-author-stat(1) — show commit author statistics of a git repository \
* git-export-patch(1) — produce perfect patch from git comits for mail submission \
* git-forest(1) — display the commit history forest \
* git-revert-stats(1) — show reverting statistics of a git repository \
* git-track(1) — set up branch for tracking a remote \
* man2html(1) — convert nroff manpages to HTML \
* pegrep(1) — perl-regexp-based multi-line grep \
* pesubst(1) — perl-regexp-based stream substitution (replaces sed for substitutions) \
* recursive_lower(1) — recursively lowercase all filenames \
* spec-beautifier(1) — program to clean up RPM .spec files \
* vcsaview(8) — display a screen dump in VCSA format \
* wktimer(1) — work timer"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20230411"

RPM_NAME = "hxtools-scripts-20230411-1.2.noarch.rpm"
RPM_HASH = "f7dc487a125e8d764feb5c6c5b8c4064138a78d0d80939f227da7e548b9d95623ac6c4398cad4bfd8be50d91140c70f7eb16daeae5b9903ed9330dd82be78d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hxtools-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
hxtools \
perl-Data--Dumper \
perl-File--Find \
perl-File--Find--Rule \
perl-Getopt--Long \
perl-IPC--Open2 \
perl-Text--CSV-XS"

inherit rpm
