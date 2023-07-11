SUMMARY = "Automated accessor generation"
DESCRIPTION = "This module automagically generates accessors/mutators for your class. \
 \
Most of the time, writing accessors is an exercise in cutting and pasting. \
You usually wind up with a series of methods like this: \
 \
    sub name { \
        my $self = shift; \
        if(@_) { \
            $self->{name} = $_[0]; \
        } \
        return $self->{name}; \
    } \
 \
    sub salary { \
        my $self = shift; \
        if(@_) { \
            $self->{salary} = $_[0]; \
        } \
        return $self->{salary}; \
    } \
 \
   \
 \
One for each piece of data in your object. While some will be unique, doing \
value checks and special storage tricks, most will simply be exercises in \
repetition. Not only is it Bad Style to have a bunch of repetitious code, \
but it's also simply not lazy, which is the real tragedy. \
 \
If you make your module a subclass of Class::Accessor and declare your \
accessor fields with mk_accessors() then you'll find yourself with a set of \
automatically generated accessors which can even be customized! \
 \
The basic set up is very simple: \
 \
    package Foo; \
    use base qw(Class::Accessor); \
    Foo->mk_accessors( qw(far bar car) ); \
 \
Done. Foo now has simple far(), bar() and car() accessors defined. \
 \
Alternatively, if you want to follow Damian's _best practice_ guidelines \
you can use: \
 \
    package Foo; \
    use base qw(Class::Accessor); \
    Foo->follow_best_practice; \
    Foo->mk_accessors( qw(far bar car) ); \
 \
*Note:* you must call 'follow_best_practice' before calling 'mk_accessors'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.51"

RPM_NAME = "perl-Class-Accessor-0.51-1.21.noarch.rpm"
RPM_HASH = "99ac0b1435ebb7c2e0e00921e5bea404f1e517c9a7be54fa6a5da181d5be45c0ed8c78f81582b71b4cb0f584a982f15240175cec8ef96d161541d4f036f33ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--Accessor \
perl-Class--Accessor--Fast \
perl-Class--Accessor--Faster \
perl-Class-Accessor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
