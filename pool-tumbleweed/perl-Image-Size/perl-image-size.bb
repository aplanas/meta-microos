SUMMARY = "Read the dimensions of an image in several popular formats"
DESCRIPTION = "The *Image::Size* library is based upon the 'wwwis' script written by Alex \
Knowles _(alex@ed.ac.uk)_, a tool to examine HTML and add 'width' and \
'height' parameters to image tags. The sizes are cached internally based on \
file name, so multiple calls on the same file name (such as images used in \
bulleted lists, for example) do not result in repeated computations."
LICENSE = "LGPL-2.1-only | Artistic-1.0"

PV = "3.300"

RPM_NAME = "perl-Image-Size-3.300-3.12.noarch.rpm"
RPM_HASH = "930073f2cb7e5c441b5a244f3850cee5729dc54292661db80dc42a7b7a9c8b4522a682c55ad30d3a0b21d5f107cbd1837678fcf43f28c913d9a05da87954d145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Image--Size \
perl-Image-Size"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.38.0 \
perl-Module--Build \
perl-Test--More"

inherit rpm
