SUMMARY = "Download and upload files from file-sharing websites"
DESCRIPTION = "plowshare is a command-line (CLI) download/upload tool for popular file \
sharing websites (aka file hosting provider or One-Click hoster). With \
plowshare, you will be able to download or upload files and manage remote \
folders and link deletion. It runs on Linux/BSD/Unix operating system. The \
basic concept is that files can be downloaded and uploaded though command \
line as easily as wget (or curl)."
LICENSE = "GPL-3.0+"

PV = "2.1.7"

RPM_NAME = "plowshare-2.1.7-2.10.noarch.rpm"
RPM_HASH = "8e12cfc501ee5a0e7be584466a376cf44eb37929b197e62999edd9de10ce287240cac31b53516f918c18a48a9a6c2686ab9bb0371eee3678b6f355a146224664"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(plowshare) \
plowshare \
plowshare-bash-completion"

RDEPENDS:${PN} += "/usr/bin/env \
bash \
curl \
perl \
perl(HTML::Entities)"

inherit rpm
