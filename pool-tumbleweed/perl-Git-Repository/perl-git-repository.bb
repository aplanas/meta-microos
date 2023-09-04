SUMMARY = "Perl interface to Git repositories"
DESCRIPTION = "Git::Repository is a Perl interface to Git, for scripted interactions with \
repositories. It's a low-level interface that allows calling any Git \
command, whether _porcelain_ or _plumbing_, including bidirectional \
commands such as 'git commit-tree'. \
 \
A Git::Repository object simply provides context to the git commands being \
run. It is possible to call the 'command()' and 'run()' methods against the \
class itself, and the context (typically _current working directory_) will \
be obtained from the options and environment. \
 \
As a low-level interface, it provides no sugar for particular Git commands. \
Specifically, it will not prepare environment variables that individual Git \
commands may need or use. \
 \
However, the 'GIT_DIR' and 'GIT_WORK_TREE' environment variables are \
special: if the command is run in the context of a Git::Repository object, \
they will be overridden by the object's 'git_dir' and 'work_tree' \
attributes, respectively. It is still possible to override them if \
necessary, using the 'env' option. \
 \
Git::Repository requires at least Git 1.5.0, and is expected to support any \
later version. \
 \
See Git::Repository::Tutorial for more code examples."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.325"

RPM_NAME = "perl-Git-Repository-1.325-3.3.noarch.rpm"
RPM_HASH = "2b2271fc402d03262dd4634876d90493aa317fa5f0b65d8bc145d0e78099768e7c41520870c7b3e253ffe4a4757e50e57f3b7137773cada1e2fed2121a245924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Git--Repository \
perl-Git--Repository--Command \
perl-Git--Repository--Plugin \
perl-Git-Repository \
perl-Test--Git"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Git--Version--Compare \
perl-System--Command \
perl-namespace--clean"

inherit rpm
