SUMMARY = "Font selection for Plain TeX"
DESCRIPTION = "Plnfss is a set of macros to provide easy font access (somewhat \
similar to NFSS but with some limitations) with Plain TeX. \
Plnfss can automatically make use of PSNFSS fd files, i.e., \
when an Adobe Type 1 is used the relevant fd file will be \
loaded automatically. For cmr-like fonts (ec, vnr, csr or plr \
fonts), a special format called pfd (plain fd) is required and \
must be loaded manually. See ot1cmr.pfd for further \
information."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-plnfss-2023.201.1.1svn15878-52.1.noarch.rpm"
RPM_HASH = "8a120bd3ecabf649fbbc1e79c830ff2c4c9db99b14c60e1d15c9157298bfd36c9ccf9046cdcae88fa5ce618e7e5e6a3ed068e9141000425c4e612d0e12dd2745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(MIKmathf.tex) \
tex(plnfss.tex) \
texlive-plnfss"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
