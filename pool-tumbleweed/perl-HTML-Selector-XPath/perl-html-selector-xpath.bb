SUMMARY = "CSS Selector to XPath compiler"
DESCRIPTION = "HTML::Selector::XPath is a utility function to compile full set of CSS2 and \
partial CSS3 selectors to the equivalent XPath expression."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.280.0"

RPM_NAME = "perl-HTML-Selector-XPath-0.280.0-1.1.noarch.rpm"
RPM_HASH = "9deb74ab5de3776f4814ee9a8d8af37fa2c435cc4068d868b86d5c40bb3217b3d5ccfc6ea40f2bf2efcb0d4cfdd93df92046761ec4f066ad682a4ebbcb5326e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Selector--XPath \
perl-HTML-Selector-XPath"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
