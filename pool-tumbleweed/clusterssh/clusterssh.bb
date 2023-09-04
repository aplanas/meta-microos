SUMMARY = "Multiplex SSH sessions onto many hosts using multiple terminals"
DESCRIPTION = "Cluster SSH opens terminal windows with connections to specified \
hosts and an administration console. Any text typed into the \
administration console is replicated to all other connected and \
active windows. This tool is intended for, but not limited to, \
cluster administration where the same configuration or commands must \
be run on each node within the cluster. Performing these commands all \
at once via this tool ensures all nodes are kept in sync."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "4.16"

RPM_NAME = "clusterssh-4.16-2.1.noarch.rpm"
RPM_HASH = "c931de7b24f8afdca0a97a8f0aa716dacd8a6c73a7c78f338ff30d8a51c71bd7f5841d3bb2d93f13a7f90178aa7267885d743fee9f3b7c72ac97bd4c9a9b06eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clusterssh \
perl-App--ClusterSSH \
perl-App--ClusterSSH--Base \
perl-App--ClusterSSH--Cluster \
perl-App--ClusterSSH--Config \
perl-App--ClusterSSH--Getopt \
perl-App--ClusterSSH--Helper \
perl-App--ClusterSSH--Host \
perl-App--ClusterSSH--L10N \
perl-App--ClusterSSH--L10N--en \
perl-App--ClusterSSH--Range \
perl-App--ClusterSSH--Window \
perl-App--ClusterSSH--Window--Tk"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Changes \
perl-Carp \
perl-English \
perl-Exception--Class \
perl-Fcntl \
perl-File--Basename \
perl-File--Path \
perl-File--Slurp \
perl-File--Temp \
perl-File--Which \
perl-FindBin \
perl-Getopt--Long \
perl-Locale--Maketext \
perl-Module--Build \
perl-Net--hostent \
perl-POSIX \
perl-Pod--Usage \
perl-Readonly \
perl-Socket \
perl-Sort--Naturally \
perl-Sys--Hostname \
perl-Test--Differences \
perl-Test--Pod \
perl-Test--Pod--Coverage \
perl-Test--Trap \
perl-Tk \
perl-Tk--ROText \
perl-Tk--Xlib \
perl-Try--Tiny \
perl-X11--Keysyms \
perl-X11--Protocol \
perl-X11--Protocol--Constants \
perl-X11--Protocol--WM \
xorg-x11-fonts-100dpi \
xorg-x11-fonts-75dpi \
xterm"

inherit rpm
