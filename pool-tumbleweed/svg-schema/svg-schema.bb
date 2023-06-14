SUMMARY = "SVG DTD and RELAX NG Schema"
DESCRIPTION = "Contains the following DTDs: \
 \
* 'Scalable Vector Graphics' (SVG) 1.0 Specification, W3C \
   Recommendation 04 September 2001. \
 \
* 'Scalable Vector Graphics' (SVG) 1.1 Specification, W3C \
Recommendation 14 January 2003"
LICENSE = "BSD-3-Clause"

PV = "20030114"

RPM_NAME = "svg-schema-20030114-123.11.noarch.rpm"
RPM_HASH = "0c6ae56202583522cb4f899c76f305aa45f1fd28b49b402e9ccd975edd6416a343cd667b72b617fcc2828525daac52dcdf7464c0d44a37461a8181531d974ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-svg-schema \
svg-dtd \
svg-schema"

RDEPENDS:${PN} += "/bin/sh \
libxml2-tools \
sgml-skel"

inherit rpm
