SUMMARY = "Easy-to-use color space conversions and more"
DESCRIPTION = "This modules provides some utility functions to handle colors and color \
space conversions. \
 \
The interface has been kept simple, so that most functions can be called \
'inline' when making calls to graphics libraries such as GD, Tk, or when \
generating HTML/CSS. (E.g. for GD: '$c = $img->colorAllocate( hsv2rgb( 270, \
0.5, 0.3 ) );'.) \
 \
Features: \
 \
* Color Space Conversions \
 \
  Color space conversions, in particular between the 'intuitive' color \
  spaces HSV (Hue/Saturation/Value) and HLS (Hue/Lightness/Saturation) to \
  and from RGB (Red/Green/Blue). \
 \
* Color Lookup \
 \
  Color lookup by name for three standard sets of colors: WWW/CSS, SVG, and \
  X11. \
 \
* Color Gradients \
 \
  Management of color gradients, which can be indexed by a floating point \
  number in the range 0..1. (Mostly intended for false-color data \
  visualization.)"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.17"

RPM_NAME = "perl-Graphics-ColorUtils-0.17-1.17.noarch.rpm"
RPM_HASH = "33773f09630fbb3e82b5abe31e6ac8ea37e20cd6dfad15825626b5a212363b2ac2454904e32df2ed635c41f4bc1ab2eb4a6c7ee4b067836480a21821b68c35ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--ColorUtils \
perl-Graphics-ColorUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
