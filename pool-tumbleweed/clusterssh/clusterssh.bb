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

RPM_NAME = "clusterssh-4.16-1.14.noarch.rpm"
RPM_HASH = "65ed2bcc9530409447cfaf751fd6312f8661e5deb4513142cf326062689584eb5c6172e074bba4d60d5acad28481319625945def927313a6845aff73f18f4fb0"
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
perl--MODULE-COMPAT-5.36.1 \
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
