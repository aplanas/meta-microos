SUMMARY = "Dynamic tagging library for awesome"
DESCRIPTION = "Shifty is an Awesome 3 extension that implements dynamic tagging. It also \
implements fine client matching configuration allowing YOU to be the master \
of YOUR desktop only by setting two simple config variables and some \
keybindings! Here are a few ways of how shifty makes awesome awesomer: \
 \
- on-the-fly tag creation and disposal \
- advanced client matching \
- easy moving of clients between tags \
- tag add/rename prompt in taglist (with completion, now configurable NEW ) \
- reordering tags and configurable positioning \
- tag name guessing, automagic no-config client grouping \
- customizable keybindings per client and tag -- NEW \
- simple yet powerful configuration"
LICENSE = "GPL-2.0+"

PV = "git20140405"

RPM_NAME = "awesome-shifty-git20140405-1.16.noarch.rpm"
RPM_HASH = "cfc47a1e3422f0f39856d0d93832237cf439fe5192604547592113bc221ac99ec04f8831988096b2a8581d6473001979cc134fbc4e2a8fdd9d0e014eb6a80950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "awesome-shifty"

RDEPENDS:${PN} += "awesome"

inherit rpm
