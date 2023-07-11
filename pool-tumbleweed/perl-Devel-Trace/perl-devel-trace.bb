SUMMARY = "Print out each line before it is executed (like C<sh -x>)"
DESCRIPTION = "If you run your program with 'perl -d:Trace program', this module will \
print a message to standard error just before each line is executed. For \
example, if your program looks like this: \
 \
         \
 \
 \
        print 'Statement 1 at line 4\\n'; \
        print 'Statement 2 at line 5\\n'; \
        print 'Call to sub x returns ', &x(), ' at line 6.\\n'; \
 \
        exit 0; \
 \
 \
        sub x { \
          print 'In sub x at line 12.\\n'; \
          return 13; \
        } \
 \
Then the 'Trace' output will look like this: \
 \
        >> ./test:4: print 'Statement 1 at line 4\\n'; \
        >> ./test:5: print 'Statement 2 at line 5\\n'; \
        >> ./test:6: print 'Call to sub x returns ', &x(), ' at line 6.\\n'; \
        >> ./test:12:   print 'In sub x at line 12.\\n'; \
        >> ./test:13:   return 13; \
        >> ./test:8: exit 0; \
 \
This is something like the shell's '-x' option."
LICENSE = "SUSE-Public-Domain"

PV = "0.12"

RPM_NAME = "perl-Devel-Trace-0.12-1.24.noarch.rpm"
RPM_HASH = "f66132298d6c758a91c63fbdd497cb4bf0eff41c941b23c1d88a31257a73d802690429bb227ea8093e1fb5a816048eebc9f8b3136a11da08ee5023e9209c51e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--Trace \
perl-Devel-Trace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
