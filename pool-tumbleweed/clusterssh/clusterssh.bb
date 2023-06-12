SUMMARY = "Multiplex SSH sessions onto many hosts using multiple terminals"
DESCRIPTION = "Cluster SSH opens terminal windows with connections to specified \
hosts and an administration console. Any text typed into the \
administration console is replicated to all other connected and \
active windows. This tool is intended for, but not limited to, \
cluster administration where the same configuration or commands must \
be run on each node within the cluster. Performing these commands all \
at once via this tool ensures all nodes are kept in sync."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "4.16"

RPM_NAME = "clusterssh-4.16-1.13.noarch.rpm"
RPM_HASH = "48f56e123c5ad3904a530a8c56a91a2eaaa4aaeae27853cd89efa3113605b3bce008455b5dbcb32e5668e914883d2b518c3f4246b13879967638e6a28a49062a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusterssh \
perl(App::ClusterSSH) \
perl(App::ClusterSSH::Base) \
perl(App::ClusterSSH::Cluster) \
perl(App::ClusterSSH::Config) \
perl(App::ClusterSSH::Getopt) \
perl(App::ClusterSSH::Helper) \
perl(App::ClusterSSH::Host) \
perl(App::ClusterSSH::L10N) \
perl(App::ClusterSSH::L10N::en) \
perl(App::ClusterSSH::Range) \
perl(App::ClusterSSH::Window) \
perl(App::ClusterSSH::Window::Tk)"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(CPAN::Changes) \
perl(Carp) \
perl(English) \
perl(Exception::Class) \
perl(Fcntl) \
perl(File::Basename) \
perl(File::Path) \
perl(File::Slurp) \
perl(File::Temp) \
perl(File::Which) \
perl(FindBin) \
perl(Getopt::Long) \
perl(Locale::Maketext) \
perl(Module::Build) \
perl(Net::hostent) \
perl(POSIX) \
perl(Pod::Usage) \
perl(Readonly) \
perl(Socket) \
perl(Sort::Naturally) \
perl(Sys::Hostname) \
perl(Test::Differences) \
perl(Test::Pod) \
perl(Test::Pod::Coverage) \
perl(Test::Trap) \
perl(Tk) \
perl(Tk::ROText) \
perl(Tk::Xlib) \
perl(Try::Tiny) \
perl(X11::Keysyms) \
perl(X11::Protocol) \
perl(X11::Protocol::Constants) \
perl(X11::Protocol::WM) \
xorg-x11-fonts-100dpi \
xorg-x11-fonts-75dpi \
xterm"

inherit rpm
