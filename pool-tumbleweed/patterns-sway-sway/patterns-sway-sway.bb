SUMMARY = "Sway Tiling Wayland Compositor and related tools"
DESCRIPTION = "Sway Tiling Wayland Compositor and related tools."
LICENSE = "MIT"

PV = "20200619"

RPM_NAME = "patterns-sway-sway-20200619-6.1.aarch64.rpm"
RPM_HASH = "105835be668fdcb4e80d13e581998c18861c5229190717994ba1be472adfae1955efe66eaab1fd71cd8389b86bbb04725065abc98164d4838d43bbd8f0bab260"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-sway-sway \
patterns-sway-sway(aarch-64)"

RDEPENDS:${PN} += "Mesa \
alacritty \
fontawesome-fonts \
grim \
slurp \
sway \
swaybg \
swayidle \
swaylock \
waybar \
wofi"

inherit rpm
