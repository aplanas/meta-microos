SUMMARY = "Add line numbers to heredoc blocks that contain perl source code"
DESCRIPTION = "Add a '#line 'this-file' 392' comment to heredoc/hereis text that is going \
to be eval'ed so that error messages will point back to the right place. \
 \
Please note: when you embed '\\n' in your code, it gets expanded in \
double-quote hereis documents so it will mess up your line numbering. Use \
'\\\\n' instead when you can."
LICENSE = "Artistic-2.0 | LGPL-2.1-only"

PV = "0.35"

RPM_NAME = "perl-Eval-LineNumbers-0.35-1.10.noarch.rpm"
RPM_HASH = "967276b283f7041b5cf03856de03608541926b65ac8311d525efdda1aff79a98d96e2ae2f3cc98574274b24c2eb0f29f18908380744aac4fe53bd7ef4494b5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Eval--LineNumbers \
perl-Eval-LineNumbers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
