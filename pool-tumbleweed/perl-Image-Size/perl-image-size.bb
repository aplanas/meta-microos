SUMMARY = "Read the dimensions of an image in several popular formats"
DESCRIPTION = "The *Image::Size* library is based upon the 'wwwis' script written by Alex \
Knowles _(alex@ed.ac.uk)_, a tool to examine HTML and add 'width' and \
'height' parameters to image tags. The sizes are cached internally based on \
file name, so multiple calls on the same file name (such as images used in \
bulleted lists, for example) do not result in repeated computations."
LICENSE = "LGPL-2.1-only | Artistic-1.0"

PV = "3.300"

RPM_NAME = "perl-Image-Size-3.300-3.11.noarch.rpm"
RPM_HASH = "c6322013da2dd1f1154c77ab6de05646cced90b84d9b922b50828d976bf8e06f6e36069fd0f0a68a72c353c572731311acf2657293abbff4977977efcdf9183c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Image--Size \
perl-Image-Size"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.36.1 \
perl-Module--Build \
perl-Test--More"

inherit rpm
