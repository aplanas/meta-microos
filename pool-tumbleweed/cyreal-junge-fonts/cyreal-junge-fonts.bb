SUMMARY = "Junge Font"
DESCRIPTION = "Junge is an elegant and slim text typeface inspired by the calligraphy \
of Günther Junge. Thanks to a combination of features it performs \
equally well in most ranges. At small sizes it builds the impression of \
flittering strokes. In large headlines its refined detailing become \
visible. It is not as strictly structured as a text typeface, and has \
subtle irregularities reminiscent of its calligraphic origin."
LICENSE = "OFL-1.1"

PV = "1.002"

RPM_NAME = "cyreal-junge-fonts-1.002-7.17.noarch.rpm"
RPM_HASH = "51ddeca3f198697624baf49e6a2327bfd5e70c54f9e0a1a8d33d60c8d223e7f8be7f1e72dc36b2610bc44651e5025d136ae187262b34d3c25d9ccfefc64a0b75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-junge-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
