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

RPM_NAME = "perl-Graphics-ColorUtils-0.17-1.15.noarch.rpm"
RPM_HASH = "4438c383af159fd5234c749f914701deafcc07d8779c9077e34bab535d96a5e3b2c7a43e14272cb2d7368dcf91ddb28d0ebdb1460045970ad8ff41a846ed6ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Graphics::ColorUtils) \
perl-Graphics-ColorUtils"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
