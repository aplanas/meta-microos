SUMMARY = "Basic file system of TeX Live"
DESCRIPTION = "The basic file system layout for TeX Live installation."
LICENSE = "Apache-2.0 & Artistic-1.0 & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & LPPL-1.3c & LPPL-1.0 & MIT & BSD-3-Clause & SUSE-TeX & SUSE-Public-Domain"

PV = "2023.208"

RPM_NAME = "texlive-filesystem-2023.208-60.1.noarch.rpm"
RPM_HASH = "a15746d18f28ada32bb8ce6d0cae1e455231556650415942c851e075711e7ce37bdc9e06a2e9d36b90d22ffba0303fb128e607023c6e0145614f83589241a969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-filesystem \
texlive-filesystem"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/clear \
/usr/bin/dialog \
/usr/bin/mkdir \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/perl \
/usr/bin/setpriv \
/usr/bin/sh \
/usr/bin/stat \
/usr/bin/touch \
coreutils \
ed \
fillup \
findutils \
grep \
group-mktex \
permissions \
python3 \
rpm-macro--unitdir \
rpm-macro-service-add-post \
rpm-macro-service-add-pre \
rpm-macro-service-del-postun \
rpm-macro-service-del-preun \
sed \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
user-mktex"

inherit rpm
