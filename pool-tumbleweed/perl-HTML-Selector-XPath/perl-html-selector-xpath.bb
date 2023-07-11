SUMMARY = "CSS Selector to XPath compiler"
DESCRIPTION = "HTML::Selector::XPath is a utility function to compile full set of CSS2 and \
partial CSS3 selectors to the equivalent XPath expression."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-HTML-Selector-XPath-0.26-1.8.noarch.rpm"
RPM_HASH = "97e65406c539aba5e88cfc71249c82a481536da27fdb9e173eb8e063e61f1bfd3d036972bef1e0aa477defe1437758028852d34d8331083b073a4e11f632c28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Selector--XPath \
perl-HTML-Selector-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
