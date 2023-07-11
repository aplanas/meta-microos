SUMMARY = "Set parameters for other packages, conveniently"
DESCRIPTION = "The package provides a small number of convenient macros that \
access features in other frequently-used packages, or provide \
interfaces to other useful facilities such as the pdfTeX \
\\pdfelapsedtime primitive. Most of these macros use pgfkeys to \
provide a key-value syntax. The package also uses the package \
scrlfile from the Koma-Script bundle (for controlled loading of \
other files) and etoolbox. The package is bundled with \
sub-packages containing actual interfaces: by default, the \
package loads all available sub-packages, but techniques are \
provided for the user to select no more than the interfaces \
needed for a job."
LICENSE = "LPPL-1.0"

PV = "2023.208.3.1svn21474"

RPM_NAME = "texlive-interfaces-2023.208.3.1svn21474-53.1.noarch.rpm"
RPM_HASH = "45ee2f7b34835a72c6cca89accec2d3dd900feba8acae04c3c062a608d0a032a78911682abfa27e9a80b39228f80cf56b3eaad9abb2da7063af4cea2320e7229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interfaces-LaTeX.sty \
tex-interfaces-appendix.sty \
tex-interfaces-base.sty \
tex-interfaces-bookmark.sty \
tex-interfaces-embedfile.sty \
tex-interfaces-enumitem.sty \
tex-interfaces-environ.sty \
tex-interfaces-etoolbox.sty \
tex-interfaces-fancyhdr.sty \
tex-interfaces-hypbmsec.sty \
tex-interfaces-hyperref.sty \
tex-interfaces-makecell.sty \
tex-interfaces-marks.sty \
tex-interfaces-pgfkeys.sty \
tex-interfaces-scrlfile.sty \
tex-interfaces-tikz.sty \
tex-interfaces-titlesec.sty \
tex-interfaces-tocloft.sty \
tex-interfaces-truncate.sty \
tex-interfaces-umrand.sty \
tex-interfaces.sty \
texlive-interfaces"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-fp.sty \
tex-gettitlestring.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
tex-pgfkeys.sty \
tex-refcount.sty \
tex-scrlfile.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
