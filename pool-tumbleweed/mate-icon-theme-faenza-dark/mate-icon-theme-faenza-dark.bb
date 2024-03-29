SUMMARY = "MATE Desktop faenza compilation theme, dark variant"
DESCRIPTION = "This icon theme uses Faenza and Faience icon themes by ~Tiheum and \
some icons customised for MATE by Rowen Stipe. Also, there are some \
icons from Mint-X-F and Faenza-Fresh icon packs."
LICENSE = "GPL-3.0-only"

PV = "1.20.0"

RPM_NAME = "mate-icon-theme-faenza-dark-1.20.0-1.12.noarch.rpm"
RPM_HASH = "d4227ae1afe4890a974ecc0d1a76cd3bbb378bd4f564081d27cc29249ad421b0e54fd4758a09e18b1499a2c7ad31e5423ebb16b4aef965bf0c660bf9c3ffbe32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme-faenza-dark"

RDEPENDS:${PN} += "mate-icon-theme-faenza"

inherit rpm
