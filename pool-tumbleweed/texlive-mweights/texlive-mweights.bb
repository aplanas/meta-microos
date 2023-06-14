SUMMARY = "Support for multiple-weight font packages"
DESCRIPTION = "Many font families available for use with LaTeX are available \
at multiple weights. Many Type 1-oriented support packages for \
such fonts re-define the standard \\mddefault or \\bfdefault \
macros. This can create difficulties if the weight desired for \
one font family isn't available for another font family, or if \
it differs from the weight desired for another font family. The \
package provides a solution to these difficulties."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53520"

RPM_NAME = "texlive-mweights-2023.201.svn53520-54.1.noarch.rpm"
RPM_HASH = "0bcf3d7048a04b7a4ef031ae5f4f60795f175503e056d694cb982b57f9286677263256b4ae869c60fe347321beb81b62478daace819421c5f3466986afa38717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mweights.sty \
texlive-mweights"

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
