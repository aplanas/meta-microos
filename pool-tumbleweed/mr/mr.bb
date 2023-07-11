SUMMARY = "Version control repository manager"
DESCRIPTION = "The mr(1) command can checkout, update, or perform other actions on a \
set of repositories as if they were one combined respository. It \
supports any combination of git, svn, mercurial, bzr, darcs, cvs, \
vcsh, fossil, and veracity repositories. It supports extensions which \
in turn can use more version control systems. \
 \
It is configurable via shell scripting. Some examples of things it can do include: \
 \
 * Update a repository no more frequently than once every twelve hours. \
 * Run an arbitrary command before committing to a repository. \
 * When updating a git repository, pull from two different upstreams \
   and merge the two together. \
 * Run several repository updates in parallel, greatly speeding up \
   the update process. \
 * Remember actions that failed due to a laptop being offline, so they can be retried when it comes back online. \
 \
This package also includes the webcheckout(1) command."
LICENSE = "GPL-2.0-only"

PV = "1.20180726"

RPM_NAME = "mr-1.20180726-1.10.noarch.rpm"
RPM_HASH = "149369af6ce9ff0646d2eb6030c23c6713b085eedd0da8513d34a2ee5c629bf8532eb91ba9873cd1b4604f10b08afab96dded956d3e32822075abc1bb08a92f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mr"

RDEPENDS:${PN} += "/usr/bin/env \
perl"

inherit rpm
