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

RPM_NAME = "python39-xsge_tiled-2.0-1.3.noarch.rpm"
RPM_HASH = "37bf6854c62a797465c42a86b449f0680714b38a351654164cbe2391f5f667693c766fd1d4bc61c6de93aeeca2e7cf8b89e51147b9a605f2763fbb4a2f348bcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-tiled \
python39-xsge-tiled \
python3dist-xsge-tiled"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-xsge-path"

inherit rpm
