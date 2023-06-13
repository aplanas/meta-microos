SUMMARY = "CSS Selector to XPath compiler"
DESCRIPTION = "HTML::Selector::XPath is a utility function to compile full set of CSS2 and \
partial CSS3 selectors to the equivalent XPath expression."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-HTML-Selector-XPath-0.26-1.7.noarch.rpm"
RPM_HASH = "f19a0d8c8337f44550cb1f312beb53b584a58d08cec2e407fe820cf5066b722ce69a93e163faea3d664eeb77fdcdc8a233741360a29a6edebe97ceff4ea5b2af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::Selector::XPath) \
perl-HTML-Selector-XPath"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
