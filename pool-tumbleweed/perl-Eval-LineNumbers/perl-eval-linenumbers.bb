SUMMARY = "Add line numbers to heredoc blocks that contain perl source code"
DESCRIPTION = "Add a '#line 'this-file' 392' comment to heredoc/hereis text that is going \
to be eval'ed so that error messages will point back to the right place. \
 \
Please note: when you embed '\\n' in your code, it gets expanded in \
double-quote hereis documents so it will mess up your line numbering. Use \
'\\\\n' instead when you can."
LICENSE = "Artistic-2.0 | LGPL-2.1-only"

PV = "0.35"

RPM_NAME = "perl-Eval-LineNumbers-0.35-1.11.noarch.rpm"
RPM_HASH = "23d7153711b57be3ddf5f6fcad5780ee1abfa8041a2ba4a529e2a0c15645ef90658c12a4ba434819884e5e4f1c8c317a4551930170942c46a77633a5ddf9899d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Eval--LineNumbers \
perl-Eval-LineNumbers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
