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

RPM_NAME = "python310-xsge_tiled-2.0-1.3.noarch.rpm"
RPM_HASH = "27f2409b8e4bb81f91fedc264614fb4755af0ea801fc49d312194947eb1bafcda6f1ee14f71af9ed15f66e9ca2bf54f95b86807bceb7e5f6172de16fc2f3c5a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-tiled \
python3.10dist-xsge-tiled \
python310-xsge-tiled \
python3dist-xsge-tiled"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame \
python310-xsge-path"

inherit rpm
