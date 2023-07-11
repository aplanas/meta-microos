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

RPM_NAME = "python311-xsge_tiled-2.0-1.4.noarch.rpm"
RPM_HASH = "0aecc357c8ae716e010f2b2f0a5051e582c33b7c3524483230917e6b4656ba704716c0bf96b30200d083aea8dc1738b76daf24155357d8e4b25f459cf47bd3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-tiled \
python3.11dist-xsge-tiled \
python311-xsge-tiled \
python3dist-xsge-tiled"

RDEPENDS:${PN} += "python-abi \
python311-sge-pygame \
python311-xsge-path"

inherit rpm
