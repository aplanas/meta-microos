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

RPM_NAME = "perl-Graphics-ColorUtils-0.17-1.16.noarch.rpm"
RPM_HASH = "bd972fa0a78bc0997eea9708345d36e9363ea3edaf28ef7bf22e4328957fb073903558ed2f51c4a811ba8627673759c77e194033cdc94e07db47eb27a265df2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--ColorUtils \
perl-Graphics-ColorUtils"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
