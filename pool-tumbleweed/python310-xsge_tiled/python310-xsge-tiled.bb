SUMMARY = "xSGE Tiled Library"
DESCRIPTION = "xSGE is a collection of extensions for the SGE licensed under the GNU \
General Public License.  They are designed to give additional features \
to free/libre software games which aren't necessary, but are nice to \
have. \
 \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides support for loading the JSON format of the \
Tiled Map Editor. This allows you to use Tiled to edit your game’s world \
(e.g. levels), rather than building a level editor yourself."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "python310-xsge_tiled-2.0-1.4.noarch.rpm"
RPM_HASH = "3893d04b3f96d7f3376ccd1f029e71106c8183273a14ed8f059b4fc8a9293279d4bb39598bd9859486c1690823fbece0484875dbca6c9a5eae49803df52ed678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xsge-tiled \
python310-xsge-tiled \
python3dist-xsge-tiled"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame \
python310-xsge-path"

inherit rpm
