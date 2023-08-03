SUMMARY = "Support for multiple-weight font packages"
DESCRIPTION = "Many font families available for use with LaTeX are available \
at multiple weights. Many Type 1-oriented support packages for \
such fonts re-define the standard \\mddefault or \\bfdefault \
macros. This can create difficulties if the weight desired for \
one font family isn't available for another font family, or if \
it differs from the weight desired for another font family. The \
package provides a solution to these difficulties."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53520"

RPM_NAME = "texlive-mweights-2023.209.svn53520-55.1.noarch.rpm"
RPM_HASH = "4286715257b5a5b2d5cc5fd054527faad8c167b01d3926d63d27ed82ee3fd22d34276799fb11e2d5f5354630332c028bff66460b5a83d348e8f947ae430b0279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mweights.sty \
texlive-mweights"

RDEPENDS:${PN} += "/usr/bin/sh \
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
