SUMMARY = "Info Files for the XEmacs Packages"
DESCRIPTION = "This package contains all the info files for the extra packages for \
XEmacs. All these files can be read online with XEmacs and describe \
XEmacs and some of its modes. \
 \
 \
 \
Authors: \
-------- \
    Chuck Thompson   <cthomp@cs.uiuc.edu> \
    Ben Wing <wing@666.com> \
    and many other contributors"
LICENSE = "GPL-3.0-or-later"

PV = "20130822"

RPM_NAME = "xemacs-packages-info-20130822-12.8.noarch.rpm"
RPM_HASH = "6b0e719c8634c20dd52a39edec89996022ce1559bf27a1a3cbef0c3bb44d4efa040b0bdbdefa7dac7dccd70685385d5d827458c1f125356c387913ecd1df99d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xemacs-info-/usr/share/xemacs/xemacs-packages/info/auctex.info.gz \
xemacs-packages-info"

RDEPENDS:${PN} += ""

inherit rpm
