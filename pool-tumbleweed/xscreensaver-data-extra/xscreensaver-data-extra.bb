SUMMARY = "Selection of screensavers from xscreensaver"
DESCRIPTION = "The xscreensaver program waits until the keyboard and mouse have \
been idle for a period of time, and then runs a graphics demo \
chosen at random. It turns off as soon as there is any mouse or \
keyboard activity. It can also lock the screen immediately, after a \
longer idle period, or on demand. \
 \
This packages contains additional graphics demos."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.06"

RPM_NAME = "xscreensaver-data-extra-6.06-4.3.aarch64.rpm"
RPM_HASH = "57e1aa8099cbcd3996e73c7301cc79cc20df5c78f81504090d2dcd4aae683f2ba31ccd1894e5b5a1edff4953bd3952bec9c48adb25cc24cb65294643b0dc8dac"

RPROVIDES:${PN} += "application() \
application(abstractile.desktop) \
application(anemone.desktop) \
application(anemotaxis.desktop) \
application(antinspect.desktop) \
application(antmaze.desktop) \
application(antspotlight.desktop) \
application(apollonian.desktop) \
application(apple2.desktop) \
application(atlantis.desktop) \
application(attraction.desktop) \
application(atunnel.desktop) \
application(barcode.desktop) \
application(beats.desktop) \
application(binaryhorizon.desktop) \
application(binaryring.desktop) \
application(blaster.desktop) \
application(blinkbox.desktop) \
application(blitspin.desktop) \
application(blocktube.desktop) \
application(boing.desktop) \
application(bouboule.desktop) \
application(bouncingcow.desktop) \
application(boxed.desktop) \
application(boxfit.desktop) \
application(braid.desktop) \
application(bsod.desktop) \
application(bubble3d.desktop) \
application(bumps.desktop) \
application(cage.desktop) \
application(carousel.desktop) \
application(ccurve.desktop) \
application(celtic.desktop) \
application(chompytower.desktop) \
application(circuit.desktop) \
application(cityflow.desktop) \
application(cloudlife.desktop) \
application(companioncube.desktop) \
application(compass.desktop) \
application(coral.desktop) \
application(covid19.desktop) \
application(crackberg.desktop) \
application(crumbler.desktop) \
application(crystal.desktop) \
application(cube21.desktop) \
application(cubenetic.desktop) \
application(cubestack.desktop) \
application(cubestorm.desktop) \
application(cubetwist.desktop) \
application(cubicgrid.desktop) \
application(cwaves.desktop) \
application(cynosure.desktop) \
application(dangerball.desktop) \
application(decayscreen.desktop) \
application(deco.desktop) \
application(deepstars.desktop) \
application(deluxe.desktop) \
application(demon.desktop) \
application(discoball.desktop) \
application(discrete.desktop) \
application(distort.desktop) \
application(drift.desktop) \
application(dymaxionmap.desktop) \
application(endgame.desktop) \
application(energystream.desktop) \
application(engine.desktop) \
application(epicycle.desktop) \
application(eruption.desktop) \
application(esper.desktop) \
application(etruscanvenus.desktop) \
application(euler2d.desktop) \
application(extrusion.desktop) \
application(fadeplot.desktop) \
application(fiberlamp.desktop) \
application(filmleader.desktop) \
application(flame.desktop) \
application(flipflop.desktop) \
application(flipscreen3d.desktop) \
application(fliptext.desktop) \
application(flow.desktop) \
application(fluidballs.desktop) \
application(flyingtoasters.desktop) \
application(fontglide.desktop) \
application(galaxy.desktop) \
application(gears.desktop) \
application(geodesic.desktop) \
application(geodesicgears.desktop) \
application(gflux.desktop) \
application(gibson.desktop) \
application(glblur.desktop) \
application(glcells.desktop) \
application(gleidescope.desktop) \
application(glhanoi.desktop) \
application(glitchpeg.desktop) \
application(glknots.desktop) \
application(glplanet.desktop) \
application(glschool.desktop) \
application(glslideshow.desktop) \
application(glsnake.desktop) \
application(gltext.desktop) \
application(grav.desktop) \
application(gravitywell.desktop) \
application(greynetic.desktop) \
application(halftone.desktop) \
application(halo.desktop) \
application(handsy.desktop) \
application(headroom.desktop) \
application(helix.desktop) \
application(hexadrop.desktop) \
application(hexstrut.desktop) \
application(hextrail.desktop) \
application(hilbert.desktop) \
application(hopalong.desktop) \
application(hydrostat.desktop) \
application(hypertorus.desktop) \
application(hypnowheel.desktop) \
application(ifs.desktop) \
application(imsmap.desktop) \
application(interaggregate.desktop) \
application(interference.desktop) \
application(intermomentary.desktop) \
application(jigglypuff.desktop) \
application(jigsaw.desktop) \
application(juggler3d.desktop) \
application(julia.desktop) \
application(kaleidescope.desktop) \
application(kaleidocycle.desktop) \
application(klein.desktop) \
application(kumppa.desktop) \
application(lament.desktop) \
application(lavalite.desktop) \
application(lcdscrub.desktop) \
application(lockward.desktop) \
application(loop.desktop) \
application(m6502.desktop) \
application(mapscroller.desktop) \
application(marbling.desktop) \
application(maze.desktop) \
application(maze3d.desktop) \
application(memscroller.desktop) \
application(menger.desktop) \
application(mirrorblob.desktop) \
application(moebius.desktop) \
application(moebiusgears.desktop) \
application(moire.desktop) \
application(moire2.desktop) \
application(molecule.desktop) \
application(morph3d.desktop) \
application(mountain.desktop) \
application(munch.desktop) \
application(nakagin.desktop) \
application(nerverot.desktop) \
application(noof.desktop) \
application(noseguy.desktop) \
application(pedal.desktop) \
application(peepers.desktop) \
application(penetrate.desktop) \
application(penrose.desktop) \
application(petri.desktop) \
application(phosphor.desktop) \
application(photopile.desktop) \
application(piecewise.desktop) \
application(pinion.desktop) \
application(pipes.desktop) \
application(polyhedra.desktop) \
application(polyominoes.desktop) \
application(polytopes.desktop) \
application(projectiveplane.desktop) \
application(providence.desktop) \
application(pulsar.desktop) \
application(pyro.desktop) \
application(qix.desktop) \
application(quasicrystal.desktop) \
application(queens.desktop) \
application(raverhoop.desktop) \
application(razzledazzle.desktop) \
application(rdbomb.desktop) \
application(ripples.desktop) \
application(rocks.desktop) \
application(romanboy.desktop) \
application(rorschach.desktop) \
application(rotzoomer.desktop) \
application(rubik.desktop) \
application(rubikblocks.desktop) \
application(sballs.desktop) \
application(scooter.desktop) \
application(shadebobs.desktop) \
application(sierpinski.desktop) \
application(sierpinski3d.desktop) \
application(skytentacles.desktop) \
application(slidescreen.desktop) \
application(slip.desktop) \
application(sonar.desktop) \
application(speedmine.desktop) \
application(sphereeversion.desktop) \
application(spheremonics.desktop) \
application(splitflap.desktop) \
application(splodesic.desktop) \
application(spotlight.desktop) \
application(sproingies.desktop) \
application(squiral.desktop) \
application(squirtorus.desktop) \
application(stairs.desktop) \
application(starfish.desktop) \
application(starwars.desktop) \
application(stonerview.desktop) \
application(strange.desktop) \
application(superquadrics.desktop) \
application(surfaces.desktop) \
application(swirl.desktop) \
application(tangram.desktop) \
application(tessellimage.desktop) \
application(timetunnel.desktop) \
application(topblock.desktop) \
application(triangle.desktop) \
application(tronbit.desktop) \
application(truchet.desktop) \
application(twang.desktop) \
application(unicrud.desktop) \
application(unknownpleasures.desktop) \
application(vermiculate.desktop) \
application(vfeedback.desktop) \
application(vigilance.desktop) \
application(voronoi.desktop) \
application(wander.desktop) \
application(webcollage.desktop) \
application(whirlwindwarp.desktop) \
application(winduprobot.desktop) \
application(wormhole.desktop) \
application(xanalogtv.desktop) \
application(xflame.desktop) \
application(xjack.desktop) \
application(xlyap.desktop) \
application(xmatrix.desktop) \
application(xrayswarm.desktop) \
application(xspirograph.desktop) \
application(zoom.desktop) \
config(xscreensaver-data-extra) \
xscreensaver-data-extra \
xscreensaver-data-extra(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgle.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
