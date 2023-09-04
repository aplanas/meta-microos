SUMMARY = "Format mathematical intervals, ensuring proper spacing"
DESCRIPTION = "When typing an open interval as $]a,b[$, a closing bracket is \
being used in place of an opening fence and vice versa. This \
leads to the wrong spacing in, say, $]-a,b[$ or $A\\in]a,b[=B$. \
The package attempts to solve this using: \\interval{a}{b} -> \
[a,b] \\interval[open]{a}{b} -> ]a,b[ \\interval[open left]{a}{b} \
-> ]a,b] The package also supports fence scaling and ensures \
that the enclosing fences will end up having the proper closing \
and opening types. TeX maths does not do this job properly. The \
package depends on pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn50265"

RPM_NAME = "texlive-interval-2023.209.0.0.4svn50265-54.1.noarch.rpm"
RPM_HASH = "36ff86dc775c7b060f9a72ebbec54db5256edf4fb9a9f1e8890932a519880aa1e0672404f22a615ad89b23710e29b9422670184251b2a4cbdfc274bfa75de98f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interval.sty \
texlive-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
